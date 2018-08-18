<template>
  <div>
    <table>
      <tr>
        <td>User Deck</td>
        <td v-for="(item, index) in userDeck">
          <img class="card-img" :src="require('@/assets/img/cards/'+item)">
        </td>
      </tr>
      <tr>
        <td>
        </td>
        <td>
          <button class="hit-btn">Hit</button>
          <button class="std-btn">Stand</button>
        </td>
      </tr>
      <tr>
        <td>Dealer Deck</td>
        <td v-for="(item, index) in dealerDeck">
          <img v-if="index==0" class="card-img" src="@/assets/img/cards/card-back-side.jpg">
          <img v-if="index==1" class="card-img" :src="require('@/assets/img/cards/'+item)">
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
import axios from 'axios'
import * as Utils from "@/lib/utils.js";

export default {
  name: 'black-jack',
  data () {
    return {
      userDeck:[],
      dealerDeck : [],
    }
  },

  created() {
    this.getUserDeckList();
    this.getDealerDeckList();
  },

  methods:{
    getUserDeckList(){
      axios.get('/api/cardDeck/user')
        .then(response => {
          let result = response.data;
          this.userDeck = this.parseToCardInfo(result);
        })
        .catch(e => {
          console.log('err', e);
        })
    },
    getDealerDeckList(){
      axios.get('/api/cardDeck/dealer')
        .then(response => {
          let result = response.data;
          this.dealerDeck = this.parseToCardInfo(result);
        })
        .catch(e => {
          console.log('err', e);
        })
    },

    parseToCardInfo(item){
      let tempArr = [];

      item.forEach(function(item){
        let cardNum = Utils.strToNumber(item.cardNum);
        let cardShape = item.cardShape.toLowerCase();
        let imgPath = cardNum+'_of_'+cardShape+'.png';

        tempArr.push(imgPath);
      });

      return tempArr;
    },

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
  .card-img{
    width: 140px;
    height: 200px;
  }
  .hit-btn {
    /* change bg color to get different hues    */
    background-color: salmon;
    color: white;
    padding: 2em 3em;
    border: none;
    transition: all .3s ease;
    border-radius: 5px;
    letter-spacing: 2px;
    text-transform: uppercase;
    outline: none;
    align-self: center;
    cursor: pointer;
    font-weight: bold;
  }

  .hit-btn:hover {
    animation: random-bg .5s linear infinite, grow 1300ms ease infinite;
  }

  .std-btn {
    /* change bg color to get different hues    */
    background-color: dimgrey;
    color: white;
    padding: 2em 3em;
    border: none;
    transition: all .3s ease;
    border-radius: 5px;
    letter-spacing: 2px;
    text-transform: uppercase;
    outline: none;
    align-self: center;
    cursor: pointer;
    font-weight: bold;
  }


  /* add default color for animation start  */


  /* toggle this class */

  .color-bg-start {
    background-color: salmon;
  }


  /* toggle class bg-animate-color */

  .bg-animate-color {
    animation: random-bg .5s linear infinite;
  }


  /* add animation to bg color  */

  @keyframes random-bg {
    from {
      filter: hue-rotate(0);
    }
    to {
      filter: hue-rotate(360deg);
    }
  }



  .start-fun {
    background-color: #fff !important;
    /* change color of button text when fun is started   */
    color: salmon !important;
  }

  /* pulsating effect on button */
  @keyframes grow {
    0% {
      transform: scale(1);
    }
    14% {
      transform: scale(1.3);
    }
    28% {
      transform: scale(1);
    }
    42% {
      transform: scale(1.3);
    }
    70% {
      transform: scale(1);
    }
  }

</style>


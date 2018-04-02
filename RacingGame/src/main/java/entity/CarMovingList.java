package entity;

import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 24.
 * Github : http://github.com/betterfly88
 */


public class CarMovingList {
    /*
        FIXME List타입을 MOVING_TYPE으로 할지, String으로 할지...
        FIXME 결국엔 "-" / "" 값으로 처리하려면 String으로 해야하는데
        FIXME List의 타입을 String으로 하기는 싫고
     */

    private List<MOVING_TYPE> carMoveList;
    private List<String> moveList;
    private String moveType;

    public CarMovingList(){
        carMoveList = new ArrayList<>();
        moveList= new ArrayList<>();
    }

    public List<MOVING_TYPE> addCarMoveState(MOVING_TYPE moveType){
        carMoveList.add(moveType);

        return this.carMoveList;
    }

    public List<String> addCarMoveList(MOVING_TYPE moveType){
        if(this.getMoveList().size() < 1)
            this.moveList.add(moveType.getType());

        this.moveList.add(moveList.get(this.moveList.size()-1)+moveType.getType());

        return this.moveList;
    }

    public List<MOVING_TYPE> getMoveList(){
        return this.carMoveList;
    }

}
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
    private List<MOVING_TYPE> carMoveList;
    private List<String> moveList;

    public CarMovingList(){
        carMoveList = new ArrayList<>();
        moveList= new ArrayList<>();
    }

    public List<MOVING_TYPE> addCarMoveState(MOVING_TYPE moveType){
        this.carMoveList.add(moveType);

        return this.carMoveList;
    }

    public List<String> addCarMoveList(MOVING_TYPE moveType){
        if(this.moveList.size() < 1){
            this.moveList.add(moveType.getType());
            return this.moveList;
        }

        this.moveList.add(moveList.get(this.moveList.size()-1)+moveType.getType());

        return this.moveList;
    }

    public List<MOVING_TYPE> getMoveList(){
        return this.carMoveList;
    }

    public List<String> getStringMoveList(){
        return this.moveList;
    }

}
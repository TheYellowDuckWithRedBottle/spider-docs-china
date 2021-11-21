package spiderdocschina;

import org.junit.jupiter.api.Test;
import spiderdocschina.entity.Edge;

import java.util.ArrayList;
import java.util.List;

public class graphicModelTtest {
    int [][] unweightedRaw={
            {0,1},{0,2},{0,3},{1,4},
            {2,1},{2,3},{3,4},{4,2}
    };
    int [][] weightedRaw={{0,1,1},{0,2,1},{0,3,1},{1,4,1},
            {2,1,1},{2,3,1},{3,4,1},{4,2,1}};



    @Test
    public void test(){
        List<List<Integer>> unweightedGraph = buildUnweightGraph(5,unweightedRaw);
        List<List<Edge>> weightedGraph  = buildWeightedGraph(5,weightedRaw);
    }
    public static List<List<Integer>> buildUnweightGraph(int vCount,int [][] raw){
    return null;
    }
    public static List<List<Edge>> buildWeightedGraph(int vCount,int [][] raw){
        List g =new ArrayList<List<Edge>>();
        for(int i=0;i<vCount;i++){
            g.add(new ArrayList<>());
        }
      return null;
    }
}

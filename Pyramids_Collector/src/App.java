import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        PyramidDao pyramid = new PyramidDaoImp();
        System.out.println(pyramid.getAllPyramids().size());
        int i = 0;
        for(Pyramid p : pyramid.getAllPyramids()){
            System.out.println("#"+ i++ +" " +p);
        }
        Collections.sort(pyramid.getAllPyramids(),new PyramidComparator());
        for(Pyramid p : pyramid.getAllPyramids()){
            System.out.println(p.getHeight()+"\t"+"->"+"\t"+p.getModern_name());
        }

        System.out.println(pyramid.getNoPyramidsPerSite());
    }
}

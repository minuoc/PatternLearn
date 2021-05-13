package pattern.visitor;


import java.util.Iterator;

public class ListVisitor extends Vistor{

    private String currentDir = "";



    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }


    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String savedir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = savedir;
    }


}

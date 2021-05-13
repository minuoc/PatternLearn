package pattern.visitor;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Making root entries ...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi",1000));
            bindir.add(new File("latex",2000));

            rootdir.accept(new ListVisitor());

            System.out.println("");

        }catch (Exception e){

        }
    }

}

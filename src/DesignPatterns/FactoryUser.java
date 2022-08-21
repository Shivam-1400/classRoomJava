package DesignPatterns;

interface Syllabus{
  void display();
}
class CPP implements Syllabus{
  public void display(){
    System.out.println("Array, Pointer, Loops, Class");
  }
}
class JAVA implements Syllabus{
  public void display(){
    System.out.println("Threads, Interface, Exceptions");
  }
}

//------------------------------------

interface Author{
  void showList();
}
class CPPAuthor implements Author{
  public void showList(){
    System.out.println("Yashwant Kant, Ravichandran");
  }
}
class JAVAAuthor implements Author{
  public void showList(){
    System.out.println("James Gosling, Rajesh Bansal");
  }
}

//-------------------------------------

interface SyllabusAuthor{
  Syllabus getSyllabus(String subject);
  Author getAuthors(String book);
}
class SyllabusFactory implements SyllabusAuthor{
  public Syllabus getSyllabus(String subject){
    if(subject.equals("cpp")){
      return new CPP();
    }
    else if(subject.equals("java")){
      return new JAVA();
    }
    else{
      return null;
    }
  }
  public Author getAuthors(String book){
    return null;
  }
}
class AuthorFactory implements SyllabusAuthor{
  public Syllabus getSyllabus(String subject){
    return null;
  }
  public Author getAuthors(String book){
    if(book.equals("cpp")){
      return new CPPAuthor();
    }
    else if(book.equals("java")){
      return new JAVAAuthor();
    }
    else{
      return null;
    }
  }
}

//--------------------------------------

class FactoryProducer{
  static SyllabusAuthor getFactory(String type){
    if(type.equals("syllabus"))
    	return new SyllabusFactory();
    else if(type.equals("author"))
    	return new AuthorFactory();
    else 
    	return null;
  }
}

//-----------------------------------------

public class FactoryUser {
  public static void main(String args[]){
    SyllabusAuthor syl= FactoryProducer.getFactory("syllabus");
    Syllabus cpp= syl.getSyllabus("cpp");
    cpp.display();
    Syllabus java= syl.getSyllabus("java");
    java.display();
    
    SyllabusAuthor auth= FactoryProducer.getFactory("author");
    Author cppA= auth.getAuthors("cpp");
    cppA.showList();
    Author javaA= auth.getAuthors("java");
    javaA.showList();
  }
}

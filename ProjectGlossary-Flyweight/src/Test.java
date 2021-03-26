public class Test
{
  public static void main(String[] args)
  {
    Project project1 = new Project("Project 1", "uk");
    project1.addGlossaryItem("Client",
        "The client part of a client/server" + " application.");
    project1
        .addGlossaryItem("User", "End user in form of a doctor or a nurse.");
    project1.addGlossaryItem("Account", "A location on the server application "
        + "storing username, password and phone number.");
    System.out
        .println("Project 1: Client: " + project1.getDefinition("Client"));
    System.out.println(project1);

    // A new project with the project glossary as in project 1
    Project project3 = new Project("Project 3", "uk");
    GlossaryItem[] glossaryItems = project1.getGlossary().getAll();
    for (int i = 0; i < glossaryItems.length; i++)
    {
      project3.addGlossaryItem(glossaryItems[i].getPhrase(),
          glossaryItems[i].getDefinition());
    }
    System.out.println(project3);
  }
}

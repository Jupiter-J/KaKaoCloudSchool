package practice2;


import practice2.ui.menu.ClubMenu;

public class StoryAssistant{

    private void startStory()
    {
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }

    public static void main(String[] args) {
        practice2.StoryAssistant assistant = new practice2.StoryAssistant();
        assistant.startStory();
    }
}
interface TaskAction {
    void handleAction();
}

class SpotifyTaskAction implements TaskAction {

    @Override
    public void handleAction() {
        System.out.println("Spotify");
    } 
}

class OpenAITaskAction implements TaskAction {

    @Override
    public void handleAction() {
        System.out.println("OpenAI");
    } 
}

interface TaskActionFactory {
    TaskAction createTaskAction();
}

class SpotifyFactory implements TaskActionFactory {

    @Override
    public TaskAction createTaskAction() {
        return new SpotifyTaskAction();
    }

}

class OpenAIFactory implements TaskActionFactory {

    @Override
    public TaskAction createTaskAction() {
        return new OpenAITaskAction();
    }

}

class Main {
    public static void main(String[] args) {
        TaskActionFactory spotifyFactory = new SpotifyFactory();
        TaskActionFactory openaiFactory = new OpenAIFactory();

        TaskAction spotifyTaskAction = spotifyFactory.createTaskAction();
        TaskAction openaiTaskAction = openaiFactory.createTaskAction();

        spotifyTaskAction.handleAction();
        openaiTaskAction.handleAction();
    }
}

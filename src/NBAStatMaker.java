public class NBAStatMaker {
    public static void main(String[] args) throws Exception {
        UserInterface ui = new UserInterface();
        Request request = new Request();
        while(true){
            String playerFirstName = ui.inputFirstName();
            String playerLastName = ui.inputLastName();
            String s = ui.seasons();
            if (playerFirstName.equals("Q")) {
                System.out.println("Bye");
                break;
            }
            else{
                 request.setFirstName(playerFirstName);
                 request.setLastName(playerLastName);
                 request.setName();
                 request.setSeasons(s);
                 request.setSeasonavg(s);
                 break;
            }

        }
    }
}

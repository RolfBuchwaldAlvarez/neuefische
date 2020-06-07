public class PermittedPeople {

    public static String maxPeopleAlert(int people){
            if (people > 30) {
                return "Zu viele Personen.";
            }

            return "Maximale Personenzahl nicht überschritten.";
        }

    public static String colourAlert(String alarmstufe){
        switch (alarmstufe){
            case "rot":
                return "keine Personen";
            case "gelb":
                return "max 30 Personen";
            case "grün":
                return "max 60 Personen";
            default:
                return "invalid alert";
        }
    }

}

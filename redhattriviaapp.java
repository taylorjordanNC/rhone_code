public class RedHatTriviaApp {

    public static void main(String[] args) {
        RedHatTriviaApp app = new RedHatTriviaApp();
        app.start();
    }

    public void start() {
        printWelcomeMessage();
        String topic = getUserInput("Enter a topic (or just type 'surprise me'): ");
        String fact = fetchRandomFact(topic);
        displayFact(topic, fact);
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to the RedHatTriviaApp!");
        System.out.println("Discover fun facts about Red Hat, open source, and more!");
        System.out.println();
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt);
        return new java.util.Scanner(System.in).nextLine();
    }

    private String fetchRandomFact(String topic) {
        // Simulated random fact fetching logic.
        switch (topic.toLowerCase()) {
            case "open source":
                return "Did you know that Red Hat is the world’s leading provider of open source solutions? That’s a fancy way of saying we make free stuff valuable.";
            case "linux":
                return "Red Hat Enterprise Linux (RHEL) is like a tuxedo for your servers: sleek, secure, and ready for enterprise parties.";
            case "culture":
                return "At Red Hat, the company culture is built on transparency. That means even the coffee machine has a changelog.";
            case "surprise me":
                return "Red Hat started in 1993, the same year " + "Jurassic Park" + " hit theaters. Coincidence? We think not.";
            default:
                return "Sorry, I don’t have facts about '" + topic + "', but did you know that the Red Hat logo used to have a secret agent wearing a fedora?";
        }
    }

    private void displayFact(String topic, String fact) {
        System.out.println();
        System.out.println("Here’s your fact about " + topic + ":");
        System.out.println(fact);
        System.out.println("Thank you for using RedHatTriviaApp! Come back when you want to learn more about the coolest open source company around.");
    }

    // BONUS: Implement a feature to save Red Hat facts to a "book of open source trivia."
}

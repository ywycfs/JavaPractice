public class JavaGit {
	public static void main(String[] args) {
		String git = "Hello Git";
		for(int i=0; i<git.split(" ").length; i++) {
			System.out.println(git.split(" ")[0]);
			System.out.println(git.split(" ")[1]);
		}
	}
}

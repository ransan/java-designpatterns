package builder_pattern;

public class BuilderPatternDriver {

	public static void main(String[] args) {
		BuilderPattern pattern = new BuilderPattern.BuilderClass("1161", "RanjithP6").setExperience("3.7").build();
		System.out.println("Object" + pattern);
	}
}

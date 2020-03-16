package src.builder_pattern;

public class BuilderPattern {
	private String id;
	private String name;
	private String experience;

	private BuilderPattern(BuilderClass builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.experience = builder.experience;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getExperience() {
		return experience;
	}

	public static class BuilderClass {
		private String id;
		private String name;
		private String experience;
		public BuilderClass(String id, String name) {
			this.id = id;
			this.name = name;
		}
		public BuilderClass setExperience(String experience) {
			this.experience = experience;
			return this;
		}

		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}
}

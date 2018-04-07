import java.util.Comparator;

class comparePerson implements Comparator<student> {
	@Override
	public int compare(student person1, student person2) {
		int result = person1.getName().compareTo(person2.getName());
	    return result == 0 ? person1.getName().compareTo(((student) person2).getName()) : result;
	}

}
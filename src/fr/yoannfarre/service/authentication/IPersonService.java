package fr.yoannfarre.service.authentication;

import fr.yoannfarre.model.Person;
import fr.yoannfarre.model.Response;

public interface IPersonService {

	public Response addPerson(Person p);

	public Response deletePerson(int id);

	public Person getPerson(int id);

	public Person[] getAllPersons();

}

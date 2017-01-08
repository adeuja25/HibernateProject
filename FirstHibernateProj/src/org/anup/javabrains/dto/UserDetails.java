package org.anup.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.SelectBeforeUpdate;


@Entity //(name="USER_DETAILS") // needs to treat this class as an entity and save it
@NamedQuery(name="UserDetails.byId",query="from UserDetails where userId=?") // for named queries, two parameters name and query
//@Table(name="USER_DETAILS") // only table name changes, entity name is same
@SelectBeforeUpdate(true)
public class UserDetails{
	@Id // primary key
	//@Column(name="USER_ID") // column name
	@GeneratedValue(strategy = GenerationType.AUTO) // generates automatically new value
	
	private int userId;
	
	//@Column(name="USER_NAME")// overrides the column name from userName to USER_NAME
	//@Basic() //treated as a field which should be persisted
	//@Transient // ignores username and does not persist
	private String userName;
	
	//@OneToOne // mapping relationship
	//@OneToMany(mappedBy="user") // needs collection
	/*@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"),
				inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))// overriding names
*/	//@JoinColumn(name="VEHICLE_ID")// change the name from vehicle_vehicleId to VEHICLE_ID
//	@ManyToMany
	// cascadeType.All for all operations
	/*@OneToMany(cascade=CascadeType.PERSIST)// if you see any new entities which have not been saved then go ahead and save it
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	*/
/*	@ElementCollection(fetch=FetchType.EAGER) // to persist collection, eagerly is default initialization,Eager gets the entire object
	@JoinTable(name="USER_ADDRESS",joinColumns=@JoinColumn(name="USER_ID")) // change the table name and user_id
	@GenericGenerator(name="increment", strategy="increment")// used for below generator
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "increment", type = @Type(type="long")) // primary key
	private Collection<Address> listOfAddresses = new ArrayList<Address>();


	@Embedded // embeddable object
	@AttributeOverrides({ // to use multiple AttributeOverride
	@AttributeOverride(name="street",column=@Column(name="HOME_STREET_NAME ")), // overriding
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY_NAME ")), // overriding
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE_NAME ")), 
	@AttributeOverride(name="pincode",column=@Column(name="HOME_PIN_CODE"))})
	private Address homeAddress;
	@Embeddedsssssssss
	private Address officeAddress;
	
	@Temporal(TemporalType.DATE) // just gets the date
	private Date joinedDate;
	
	// means description is a large object more than 255
	// Blob -  byte stream, Clob- character stream(default)
	@Lob
	@Type(type = "org.hibernate.type.TextType") // to convert lob into texttype in hibernate
	private String Description;
	
	@Id // primary key
	@Column(name="USER_ID") can be used in getter */
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}

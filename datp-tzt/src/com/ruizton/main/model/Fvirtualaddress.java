package com.ruizton.main.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * Fvirtualaddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "fvirtualaddress")
// @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Fvirtualaddress implements java.io.Serializable {

	// Fields

	private String fid;
	private Fvirtualcointype fvirtualcointype;
	private String fadderess;
	private Fuser fuser ;
	private Timestamp fcreateTime;

	private int version;

	// Constructors

	/** default constructor */
	public Fvirtualaddress() {
	}

	/** full constructor */
	public Fvirtualaddress(Fvirtualcointype fvirtualcointype, String fadderess,
			int finoutType, Timestamp fcreateTime,
			Set<Fvirtualcaptualoperation> fvirtualcaptualoperations) {
		this.fvirtualcointype = fvirtualcointype;
		this.fadderess = fadderess;
		this.fcreateTime = fcreateTime;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "fId", unique = true, nullable = false)
	public String getFid() {
		return this.fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fVi_fId")
	public Fvirtualcointype getFvirtualcointype() {
		return this.fvirtualcointype;
	}

	public void setFvirtualcointype(Fvirtualcointype fvirtualcointype) {
		this.fvirtualcointype = fvirtualcointype;
	}

	@Column(name = "fAdderess", length = 128)
	public String getFadderess() {
		return this.fadderess;
	}

	public void setFadderess(String fadderess) {
		this.fadderess = fadderess;
	}


	@Column(name = "fCreateTime", length = 0)
	public Timestamp getFcreateTime() {
		return this.fcreateTime;
	}

	public void setFcreateTime(Timestamp fcreateTime) {
		this.fcreateTime = fcreateTime;
	}


	@Version
	@Column(name = "version")
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fuid")
	public Fuser getFuser() {
		return fuser;
	}

	public void setFuser(Fuser fuser) {
		this.fuser = fuser;
	}

}
package com.amicus.wbs.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_output_file")
public class OutputFile {

	@Id
	@GeneratedValue
	@Column(name = "file_id")
	private Long fileId;

	@Column(name = "wbs_id", nullable = false)
	private Long wbsId;

	@Column(name = "file_name", length = 2000, nullable = false)
	private String fileName;

	@Column(name = "system_file_name", length = 2000)
	private String systemFileName;

	@Column(length = 4000)
	private String path;

	private int size;

	@Column(name = "domain_url", length = 100)
	private String domainUrl;

	@Column(name = "use_yn", length = 1)
	private String useYn;

	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	public Long getFileId() {
		return fileId;
	}

	public void setFileid(Long fileId) {
		this.fileId = fileId;
	}

	public Long getWbsId() {
		return wbsId;
	}

	public void setWbsid(Long wbsId) {
		this.wbsId = wbsId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSystemFileName() {
		return systemFileName;
	}

	public void setSystemFileName(String systemFileName) {
		this.systemFileName = systemFileName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
}
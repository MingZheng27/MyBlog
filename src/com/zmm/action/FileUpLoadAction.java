package com.zmm.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetAddress;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zmm.bean.Images;
import com.zmm.daoimpl.FileDaoImpl;
import com.zmm.util.ApplicationUtil;

public class FileUpLoadAction extends ActionSupport {

	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;

	@Override
	public String execute() throws Exception {
		try{
			FileDaoImpl filedaoimpl = (FileDaoImpl) ApplicationUtil.getBean("FileDaoImpl");
			FileInputStream in = new FileInputStream(upload);
			FileOutputStream out = new FileOutputStream(getSavePath() + "/" + getUploadFileName());
			byte[] buff = new byte[in.available()];
			in.read(buff);
			out.write(buff);
			in.close();
			out.close();
			Images image = new Images();
			image.setId(filedaoimpl.getNum() + 1);
			String ip = InetAddress.getLocalHost().getHostAddress();
			image.setPicurl("http://" + ip + ":8090/NewBlog/image/" + uploadFileName);
			filedaoimpl.save(image);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		String[] s = uploadFileName.split("\\.");
		s[0] = String.valueOf((int)System.currentTimeMillis());
		uploadFileName = s[0] + "." +s[1];
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSavePath() {
		savePath = ServletActionContext.getServletContext().getRealPath("/image");
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}


}

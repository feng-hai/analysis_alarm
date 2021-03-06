/**  
* @Title: ObjectModelOfKafka.java
* @Package com.wlwl.cube.analyse.bean
* @Description: TODO(用一句话描述该文件做什么)
* @author fenghai  
* @date 2016年9月24日 下午4:13:31
* @version V1.0.0  
*/
package com.wlwl.cube.analyse.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wlwl.cube.ananlyse.state.JsonUtils;

/**
 * @ClassName: ObjectModelOfKafka
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fenghai
 * @date 2016年9月24日 下午4:13:31
 *
 */

public class ObjectModelOfKafka implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String DEVICE_ID;//终端编号
	private String RAW_OCTETS;// 	十六进制码流
	private String unid;// 	唯一编号
	private String proto_unid;//协议唯一编号
	private String node_unid;//节点唯一编号
	
	private String cellphone;
	

	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	private String length;// 	长度(Byte)
	private Long TIMESTAMP;// 	UNIX时间戳(毫秒)
	public Long getTIMESTAMP() {
		return TIMESTAMP;
	}
	public void setTIMESTAMP(Long tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}

	private String IP4;//IPv4地址
	private String flag_transmit="false";// 	转发标志



	public String getNode_unid() {
		return node_unid;
	}
	public void setNode_unid(String node_unid) {
		this.node_unid = node_unid;
	}
	public String getDEVICE_ID() {
		return DEVICE_ID;
	}
	public void setDEVICE_ID(String dEVICE_ID) {
		DEVICE_ID = dEVICE_ID;
	}
	public String getRAW_OCTETS() {
		return RAW_OCTETS;
	}
	public void setRAW_OCTETS(String rAW_OCTETS) {
		RAW_OCTETS = rAW_OCTETS;
	}
	public String getUnid() {
		return unid;
	}
	public void setUnid(String unid) {
		this.unid = unid;
	}
	public String getProto_unid() {
		return proto_unid;
	}
	public void setProto_unid(String proto_unid) {
		this.proto_unid = proto_unid;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
	public String getIP4() {
		return IP4;
	}
	public void setIP4(String iP4) {
		IP4 = iP4;
	}
	public String getFlag_transmit() {
		return flag_transmit;
	}
	public void setFlag_transmit(String flag_transmit) {
		this.flag_transmit = flag_transmit;
	}
	
	public String toString()
	{
		
		return JsonUtils.serialize(this)
				.replace("device_ID", "DEVICE_ID")
				.replace("timestamp", "TIMESTAMP")
				.replace("ip4", "IP4")
				.replace("raw_OCTETS", "raw_octets");
		
	}
	//解析报警数据

}

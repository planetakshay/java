package interviewexcercises;


class VMsg implements Comparable<VMsg>{
	public String rcp; // receiver of the message
	public VMsg(String rcp){
		this.rcp=rcp;
	}
	@Override
	public int compareTo(VMsg vmsg) {		
		
		return rcp.compareTo(vmsg.rcp)<0?-1:rcp.compareTo(vmsg.rcp)==0?0:1;
	}
}
class Construction
{
	public double constructCost(String matStand,double totalArea,boolean automated)
	{
		if(matStand.equals("ST") && automated==false)
			return 1200*totalArea;
		else if(matStand.equals("AST") && automated==false)
			return 1500*totalArea;
		else if(matStand.equals("HST") && automated==false)
			return 1800*totalArea;
		else if(matStand.equals("HST") && automated==true)
			return 2500*totalArea;
		else
			return 0.0;
	}

}
public class GraphThread extends Thread {

	private static final int MAX_TIME_DIFFERENCE = 17;

	private GraphHandler handler;

	private double deltaTime = 0;

	public GraphThread(GraphHandler handler) {
		this.handler = handler;
	}

	@Override
	//This happens repeatedly when the start function is called
	public void run() {
		
		long lastTime = getCurrentTime();
		int count = 0;
		int millCount = 0;
		while (true) {
			if ((getCurrentTime() - MAX_TIME_DIFFERENCE < lastTime))
				continue;
			deltaTime = getDeltaTime(lastTime);

			handler.updateGraphPanel();

			count++;
			millCount += getCurrentTime() - lastTime;
			boolean isMoreThan1Sec = millCount >= 1000;
			if (isMoreThan1Sec) {
				// System.out.println("60 Frames in: " + millCount + "ms");
				// System.out.println("Count: " + count);
				count = 0;
				millCount = 0;
			}
			lastTime = getCurrentTime();
		}
		
	}

	private double getDeltaTime(long lastTime) {
		return (1.0 * getCurrentTime() - lastTime) / 1000;
	}

	private long getCurrentTime() {
		return System.currentTimeMillis();
	}

	public double getDeltaTime() {
		return deltaTime;
	}

}

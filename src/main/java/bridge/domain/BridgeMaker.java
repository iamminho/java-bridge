package bridge.domain;

import bridge.utils.BridgeNumberGenerator;
import java.util.ArrayList;
import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {
	private final int RANDOM_LOWER_INCLUSIVE = 0;
	private final String DOWN_LOCATION = "D";
	private final String UP_LOCATION = "U";

	private final BridgeNumberGenerator bridgeNumberGenerator;

	public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
		this.bridgeNumberGenerator = bridgeNumberGenerator;
	}

	/**
	 * d
	 *
	 * @param size 다리의 길이
	 * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
	 */
	public List<String> makeBridge(int size) {
		List<String> bridge = new ArrayList<>();
		int currentSize = 0;
		while (currentSize++ < size) {
			String bridgeLocation = getBridgeLocation(bridgeNumberGenerator.generate());
			bridge.add(bridgeLocation);
		}
		return bridge;
	}

	private String getBridgeLocation(int bridgeRandomnumber) {
		if (bridgeRandomnumber == RANDOM_LOWER_INCLUSIVE) {
			return DOWN_LOCATION;
		}
		return UP_LOCATION;
	}
}

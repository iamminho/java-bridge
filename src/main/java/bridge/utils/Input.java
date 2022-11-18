package bridge.utils;

import bridge.domain.dto.BridgeSize;
import bridge.domain.dto.GameCommand;
import bridge.domain.dto.Moving;
import bridge.view.InputView;

public class Input {
	private static final InputView inputView = new InputView();

	public static BridgeSize bridgeSize() {
		while (true) {
			try {
				String inputSize = inputView.readBridgeSize();
				System.out.println();
				return new BridgeSize(inputSize);
			} catch (IllegalArgumentException error) {
				System.out.println(error);
			}
		}
	}

	public static Moving moving() {
		while (true) {
			try {
				String inputMoving = inputView.readMoving();
				return new Moving(inputMoving);
			} catch (IllegalArgumentException error) {
				System.out.println(error);
			}
		}
	}

	public static GameCommand gameCommand() {
		while (true) {
			try {
				String inputGameCommand = inputView.readGameCommand();
				return new GameCommand(inputGameCommand);
			} catch (IllegalArgumentException error) {
				System.out.println(error);
			}
		}
	}
}

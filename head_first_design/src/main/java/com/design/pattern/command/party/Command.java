package com.design.pattern.command.party;

public interface Command {
	// 작업을 실행
	public void execute();

	// 마지막 작업을 취소
	public void undo();
}

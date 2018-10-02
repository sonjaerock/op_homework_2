import java.util.ArrayList;

/**
 * 한국기술교육대학교 컴퓨터공학부 객체지향개발론및실습
 * 2018년도 2학기 관찰자 패턴 실습
 * ChatRoomLog
 * 채팅 메시지 목록 
 * ChatRoom과 User가 모두 개별적으로 유지
 * @author 김상진
 *
 */
public class ChatRoomLog{
	private ArrayList<ChatMessage> messages = new ArrayList<>();
	
	public void addMessage(String userID, String message) {
		messages.add(new ChatMessage(userID, message));
	}
	public ArrayList<ChatMessage> getMessages(){
		return messages;
	}
	public int size() {
		return messages.size();
	}
}

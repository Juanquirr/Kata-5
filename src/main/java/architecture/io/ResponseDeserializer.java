package architecture.io;

public interface ResponseDeserializer {
    Object deserialize(String content);
}

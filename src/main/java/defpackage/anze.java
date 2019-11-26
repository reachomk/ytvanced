package defpackage;

import java.io.OutputStream;

/* renamed from: anze */
public interface anze extends anzf {
    anzq getParserForType();

    int getSerializedSize();

    anzd newBuilderForType();

    anzd toBuilder();

    byte[] toByteArray();

    anvu toByteString();

    void writeTo(anwm anwm);

    void writeTo(OutputStream outputStream);
}

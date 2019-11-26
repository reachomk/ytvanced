package defpackage;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: bok */
public final class bok implements box {
    public static final bok a = new bok();

    private bok() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        if (peek == jsonToken) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (peek == jsonToken) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}

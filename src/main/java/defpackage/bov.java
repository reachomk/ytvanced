package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: bov */
public final class bov implements box {
    public static final bov a = new bov();

    private bov() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        if (peek == jsonToken) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (peek == jsonToken) {
            jsonReader.endArray();
        }
        return new bpk((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}

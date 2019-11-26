package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: bow */
public final class bow implements box {
    public static final bow a = new bow();

    private bow() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return boq.b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return boq.b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot convert json to point. Next token is ");
        stringBuilder.append(peek);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

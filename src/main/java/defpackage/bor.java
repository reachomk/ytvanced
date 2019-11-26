package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bor */
final class bor {
    static List a(JsonReader jsonReader, bjj bjj, float f, box box) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            bjj.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = (nextName.hashCode() == 107 && nextName.equals("k")) ? null : -1;
            if (obj != null) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() != JsonToken.NUMBER) {
                    while (jsonReader.hasNext()) {
                        arrayList.add(bos.a(jsonReader, bjj, f, box, true));
                    }
                } else {
                    arrayList.add(bos.a(jsonReader, bjj, f, box, false));
                }
                jsonReader.endArray();
            } else {
                arrayList.add(bos.a(jsonReader, bjj, f, box, false));
            }
        }
        jsonReader.endObject();
        bor.a(arrayList);
        return arrayList;
    }

    public static void a(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            bpf bpf = (bpf) list.get(i2);
            i2++;
            bpf bpf2 = (bpf) list.get(i2);
            bpf.f = Float.valueOf(bpf2.e);
            if (bpf.c == null) {
                Object obj = bpf2.b;
                if (obj != null) {
                    bpf.c = obj;
                    if (bpf instanceof blr) {
                        ((blr) bpf).a();
                    }
                }
            }
        }
        bpf bpf3 = (bpf) list.get(i);
        if ((bpf3.b == null || bpf3.c == null) && list.size() > 1) {
            list.remove(bpf3);
        }
    }
}

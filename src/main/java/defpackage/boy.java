package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: boy */
public final class boy implements box {
    public static final boy a = new boy();

    private boy() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        int i;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List list = null;
        List list2 = null;
        List list3 = list2;
        boolean z = false;
        while (true) {
            int i2 = -1;
            i = 1;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 105) {
                    if (hashCode != 111) {
                        if (hashCode == 118 && nextName.equals("v")) {
                            i2 = 1;
                        }
                    } else if (nextName.equals("o")) {
                        i2 = 3;
                    }
                } else if (nextName.equals("i")) {
                    i2 = 2;
                }
            } else if (nextName.equals("c")) {
                i2 = 0;
            }
            if (i2 == 0) {
                z = jsonReader.nextBoolean();
            } else if (i2 == 1) {
                list = boq.a(jsonReader, f);
            } else if (i2 == 2) {
                list2 = boq.a(jsonReader, f);
            } else if (i2 == 3) {
                list3 = boq.a(jsonReader, f);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new bnj(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            while (i < size) {
                PointF pointF2 = (PointF) list.get(i);
                int i3 = i - 1;
                arrayList.add(new bme(bpd.a((PointF) list.get(i3), (PointF) list3.get(i3)), bpd.a(pointF2, (PointF) list2.get(i)), pointF2));
                i++;
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                size--;
                arrayList.add(new bme(bpd.a((PointF) list.get(size), (PointF) list3.get(size)), bpd.a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new bnj(pointF, z, arrayList);
        }
    }
}

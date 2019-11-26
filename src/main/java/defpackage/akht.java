package defpackage;

import org.json.JSONObject;

/* renamed from: akht */
final class akht {
    public final String a;
    public final akhv b;
    public final akhw c;
    private final Object d;
    private final amur e;
    private final amqv f;

    public static akht a(String str, Object obj, akhv akhv, akhw akhw) {
        return new akht(str, obj, akhv, akhw, null, null);
    }

    public akht(String str, Object obj, akhv akhv, akhw akhw, amur amur, amqv amqv) {
        this.a = str;
        this.d = obj;
        this.b = akhv;
        this.c = akhw;
        this.e = amur;
        this.f = amqv;
    }

    public final void a(Object obj) {
        this.b.a(obj, this.d);
    }

    public final void a(JSONObject jSONObject, Object obj, String str) {
        str = String.valueOf(str);
        String valueOf = String.valueOf(this.a);
        valueOf = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        if (jSONObject.has(valueOf)) {
            amur amur = this.e;
            if (amur != null) {
                Object obj2 = amur.get(jSONObject.getString(valueOf));
                if (obj2 != null) {
                    a(obj, obj2);
                } else {
                    String str2 = "null";
                    StringBuilder stringBuilder = new StringBuilder(str2.length() + 22);
                    stringBuilder.append("Invalid mapped value: ");
                    stringBuilder.append(str2);
                    throw new akhy(stringBuilder.toString());
                }
            }
            Object obj3 = this.d;
            if (obj3 instanceof String) {
                a(obj, jSONObject.getString(valueOf));
            } else if (obj3 instanceof Integer) {
                a(obj, Integer.valueOf(jSONObject.getInt(valueOf)));
            } else if (obj3 instanceof Long) {
                a(obj, Long.valueOf(jSONObject.getLong(valueOf)));
            } else if (obj3 instanceof Float) {
                a(obj, Float.valueOf((float) jSONObject.getDouble(valueOf)));
            } else if (obj3 instanceof Double) {
                a(obj, Double.valueOf(jSONObject.getDouble(valueOf)));
            } else if (obj3 instanceof Boolean) {
                a(obj, Boolean.valueOf(jSONObject.getBoolean(valueOf)));
            }
        }
    }

    private final void a(Object obj, Object obj2) {
        amqv amqv = this.f;
        if (amqv == null || amqv.a(obj2)) {
            this.b.a(obj, obj2);
            return;
        }
        String valueOf = String.valueOf(obj2);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
        stringBuilder.append("Value outside of constraint: ");
        stringBuilder.append(valueOf);
        throw new akhy(stringBuilder.toString());
    }
}

package defpackage;

import android.util.Base64;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aamq */
final class aamq {
    public static JSONObject a(anze anze) {
        String str = "clientName";
        JSONObject jSONObject = new JSONObject();
        Class cls = anze.getClass();
        try {
            for (Method method : cls.getDeclaredMethods()) {
                method.setAccessible(true);
                if ((method.getModifiers() & 8) == 0) {
                    if (method.getName().startsWith("get") && !method.getName().endsWith("Bytes") && !method.getName().endsWith("Count") && method.getParameterTypes().length <= 0) {
                        char toLowerCase = Character.toLowerCase(method.getName().charAt(3));
                        String substring = method.getName().substring(4);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(substring).length() + 1);
                        stringBuilder.append(toLowerCase);
                        stringBuilder.append(substring);
                        String stringBuilder2 = stringBuilder.toString();
                        if (method.getReturnType() == List.class) {
                            List list = (List) method.invoke(anze, new Object[0]);
                            Object obj = null;
                            if (!(list == null || list.isEmpty())) {
                                obj = new JSONArray();
                                for (Object next : list) {
                                    if (next instanceof anze) {
                                        obj.put(aamq.a((anze) next));
                                    } else if (next instanceof anvu) {
                                        obj.put(Base64.encodeToString(((anvu) next).d(), 10));
                                    } else {
                                        obj.put(next);
                                    }
                                }
                            }
                            if (obj != null) {
                                jSONObject.put(stringBuilder2.substring(0, stringBuilder2.length() - 4), obj);
                            }
                        } else if ((anze instanceof ashl) && stringBuilder2.equals(str)) {
                            jSONObject.put(str, ((ashr) method.invoke(anze, new Object[0])).name());
                        } else {
                            if (!method.getReturnType().isEnum()) {
                                String str2 = "has";
                                String valueOf = String.valueOf(method.getName().substring(3));
                                if (valueOf.length() == 0) {
                                    valueOf = new String(str2);
                                } else {
                                    valueOf = str2.concat(valueOf);
                                }
                                if (!((Boolean) cls.getMethod(valueOf, new Class[0]).invoke(anze, new Object[0])).booleanValue()) {
                                }
                            }
                            Object invoke = method.invoke(anze, new Object[0]);
                            if (invoke instanceof anze) {
                                jSONObject.put(stringBuilder2, aamq.a((anze) invoke));
                            } else if (invoke instanceof anvu) {
                                jSONObject.put(stringBuilder2, Base64.encodeToString(((anvu) invoke).d(), 10));
                            } else {
                                jSONObject.put(stringBuilder2, invoke);
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            try {
                String str3 = "Exception while trying to convert protoMessage: ";
                String simpleName = anze.getClass().getSimpleName();
                if (simpleName.length() == 0) {
                    simpleName = new String(str3);
                } else {
                    simpleName = str3.concat(simpleName);
                }
                xtl.a(simpleName, e);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("PROTO CONVERSION FAILED", "See error logs and file bug.");
                return jSONObject2;
            } catch (JSONException e2) {
                throw new RuntimeException("This should never happen.", e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0 A:{Catch:{ Exception -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6 A:{Catch:{ Exception -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6 A:{Catch:{ Exception -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0 A:{Catch:{ Exception -> 0x0104 }} */
    public static org.json.JSONObject a(defpackage.aocf r13) {
        /*
        r0 = r13.getClass();
        r1 = new org.json.JSONObject;
        r1.<init>();
        r0 = r0.getDeclaredFields();	 Catch:{ Exception -> 0x0104 }
        r2 = r0.length;	 Catch:{ Exception -> 0x0104 }
        r3 = 0;
        r4 = 0;
    L_0x0010:
        if (r4 >= r2) goto L_0x0103;
    L_0x0012:
        r5 = r0[r4];	 Catch:{ Exception -> 0x0104 }
        r6 = 1;
        r5.setAccessible(r6);	 Catch:{ Exception -> 0x0104 }
        r7 = r5.getName();	 Catch:{ Exception -> 0x0104 }
        r8 = r5.getModifiers();	 Catch:{ Exception -> 0x0104 }
        r8 = r8 & 64;
        if (r8 == 0) goto L_0x0026;
    L_0x0024:
        goto L_0x00ff;
    L_0x0026:
        r8 = r5.getType();	 Catch:{ Exception -> 0x0104 }
        r8 = r8.isArray();	 Catch:{ Exception -> 0x0104 }
        r9 = 10;
        if (r8 == 0) goto L_0x008a;
    L_0x0032:
        r8 = r5.getType();	 Catch:{ Exception -> 0x0104 }
        r10 = byte[].class;
        if (r8 == r10) goto L_0x008a;
    L_0x003a:
        r5 = r5.get(r13);	 Catch:{ Exception -> 0x0104 }
        r6 = 0;
        if (r5 == 0) goto L_0x0083;
    L_0x0041:
        r8 = java.lang.reflect.Array.getLength(r5);	 Catch:{ Exception -> 0x0104 }
        if (r8 == 0) goto L_0x0083;
    L_0x0047:
        r6 = new org.json.JSONArray;	 Catch:{ Exception -> 0x0104 }
        r6.<init>();	 Catch:{ Exception -> 0x0104 }
        r10 = 0;
    L_0x004d:
        if (r10 >= r8) goto L_0x0083;
    L_0x004f:
        r11 = java.lang.reflect.Array.get(r5, r10);	 Catch:{ Exception -> 0x0104 }
        r12 = r11 instanceof defpackage.aocf;	 Catch:{ Exception -> 0x0104 }
        if (r12 == 0) goto L_0x0061;
    L_0x0057:
        r11 = (defpackage.aocf) r11;	 Catch:{ Exception -> 0x0104 }
        r11 = defpackage.aamq.a(r11);	 Catch:{ Exception -> 0x0104 }
        r6.put(r11);	 Catch:{ Exception -> 0x0104 }
        goto L_0x0080;
    L_0x0061:
        r12 = r11 instanceof defpackage.anze;	 Catch:{ Exception -> 0x0104 }
        if (r12 == 0) goto L_0x006f;
    L_0x0065:
        r11 = (defpackage.anze) r11;	 Catch:{ Exception -> 0x0104 }
        r11 = defpackage.aamq.a(r11);	 Catch:{ Exception -> 0x0104 }
        r6.put(r11);	 Catch:{ Exception -> 0x0104 }
        goto L_0x0080;
    L_0x006f:
        r12 = r11 instanceof byte[];	 Catch:{ Exception -> 0x0104 }
        if (r12 == 0) goto L_0x007d;
    L_0x0073:
        r11 = (byte[]) r11;	 Catch:{ Exception -> 0x0104 }
        r11 = android.util.Base64.encodeToString(r11, r9);	 Catch:{ Exception -> 0x0104 }
        r6.put(r11);	 Catch:{ Exception -> 0x0104 }
        goto L_0x0080;
    L_0x007d:
        r6.put(r11);	 Catch:{ Exception -> 0x0104 }
    L_0x0080:
        r10 = r10 + 1;
        goto L_0x004d;
    L_0x0083:
        if (r6 == 0) goto L_0x00ff;
    L_0x0085:
        r1.put(r7, r6);	 Catch:{ Exception -> 0x0104 }
        goto L_0x00ff;
    L_0x008a:
        r8 = r5.getType();	 Catch:{ Exception -> 0x0104 }
        r10 = java.lang.String.class;
        r8 = r8.equals(r10);	 Catch:{ Exception -> 0x0104 }
        if (r8 == 0) goto L_0x00a2;
    L_0x0096:
        r8 = r5.get(r13);	 Catch:{ Exception -> 0x0104 }
        r8 = (java.lang.String) r8;	 Catch:{ Exception -> 0x0104 }
        r8 = android.text.TextUtils.isEmpty(r8);	 Catch:{ Exception -> 0x0104 }
        r6 = r6 ^ r8;
        goto L_0x00c5;
    L_0x00a2:
        r6 = r5.getType();	 Catch:{ Exception -> 0x0104 }
        r8 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0104 }
        r6 = r6.equals(r8);	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00b5;
    L_0x00ae:
        r6 = r5.getInt(r13);	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00ff;
    L_0x00b4:
        goto L_0x00ce;
    L_0x00b5:
        r6 = r5.getType();	 Catch:{ Exception -> 0x0104 }
        r8 = java.lang.Boolean.TYPE;	 Catch:{ Exception -> 0x0104 }
        r6 = r6.equals(r8);	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00c8;
    L_0x00c1:
        r6 = r5.getBoolean(r13);	 Catch:{ Exception -> 0x0104 }
    L_0x00c5:
        if (r6 == 0) goto L_0x00ff;
    L_0x00c7:
        goto L_0x00ce;
    L_0x00c8:
        r6 = r5.get(r13);	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00ff;
    L_0x00ce:
        r5 = r5.get(r13);	 Catch:{ Exception -> 0x0104 }
        r6 = r5 instanceof defpackage.anxl;	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00e0;
    L_0x00d6:
        r5 = (defpackage.anxl) r5;	 Catch:{ Exception -> 0x0104 }
        r5 = defpackage.aamq.a(r5);	 Catch:{ Exception -> 0x0104 }
        r1.put(r7, r5);	 Catch:{ Exception -> 0x0104 }
        goto L_0x00ff;
    L_0x00e0:
        r6 = r5 instanceof defpackage.aocf;	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00ee;
    L_0x00e4:
        r5 = (defpackage.aocf) r5;	 Catch:{ Exception -> 0x0104 }
        r5 = defpackage.aamq.a(r5);	 Catch:{ Exception -> 0x0104 }
        r1.put(r7, r5);	 Catch:{ Exception -> 0x0104 }
        goto L_0x00ff;
    L_0x00ee:
        r6 = r5 instanceof byte[];	 Catch:{ Exception -> 0x0104 }
        if (r6 == 0) goto L_0x00fc;
    L_0x00f2:
        r5 = (byte[]) r5;	 Catch:{ Exception -> 0x0104 }
        r5 = android.util.Base64.encodeToString(r5, r9);	 Catch:{ Exception -> 0x0104 }
        r1.put(r7, r5);	 Catch:{ Exception -> 0x0104 }
        goto L_0x00ff;
    L_0x00fc:
        r1.put(r7, r5);	 Catch:{ Exception -> 0x0104 }
    L_0x00ff:
        r4 = r4 + 1;
        goto L_0x0010;
    L_0x0103:
        return r1;
    L_0x0104:
        r0 = move-exception;
        r1 = "Exception while trying to convert protoMessage: ";
        r13 = r13.getClass();	 Catch:{ JSONException -> 0x012f }
        r13 = r13.getSimpleName();	 Catch:{ JSONException -> 0x012f }
        r2 = r13.length();	 Catch:{ JSONException -> 0x012f }
        if (r2 != 0) goto L_0x011b;
    L_0x0115:
        r13 = new java.lang.String;	 Catch:{ JSONException -> 0x012f }
        r13.<init>(r1);	 Catch:{ JSONException -> 0x012f }
        goto L_0x011f;
    L_0x011b:
        r13 = r1.concat(r13);	 Catch:{ JSONException -> 0x012f }
    L_0x011f:
        defpackage.xtl.a(r13, r0);	 Catch:{ JSONException -> 0x012f }
        r13 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x012f }
        r13.<init>();	 Catch:{ JSONException -> 0x012f }
        r0 = "PROTO CONVERSION FAILED";
        r1 = "See error logs and file bug.";
        r13.put(r0, r1);	 Catch:{ JSONException -> 0x012f }
        return r13;
    L_0x012f:
        r13 = move-exception;
        r0 = new java.lang.RuntimeException;
        r1 = "This should never happen.";
        r0.<init>(r1, r13);
        goto L_0x0139;
    L_0x0138:
        throw r0;
    L_0x0139:
        goto L_0x0138;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aamq.a(aocf):org.json.JSONObject");
    }
}

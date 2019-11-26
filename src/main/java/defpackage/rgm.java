package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: rgm */
final class rgm {
    public static void a(rgh rgh, StringBuilder stringBuilder, int i) {
        String str;
        Method method;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = rgh.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            str = "get";
            if (i3 >= length) {
                break;
            }
            method = declaredMethods[i3];
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(str)) {
                    treeSet.add(method.getName());
                }
            }
            i3++;
        }
        for (String str2 : treeSet) {
            String valueOf;
            Method method2;
            String str3 = "";
            String replaceFirst = str2.replaceFirst(str, str3);
            String str4 = "List";
            if (!(!replaceFirst.endsWith(str4) || replaceFirst.endsWith("OrBuilderList") || replaceFirst.equals(str4))) {
                str4 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                if (valueOf.length() == 0) {
                    valueOf = new String(str4);
                } else {
                    valueOf = str4.concat(valueOf);
                }
                method = (Method) hashMap.get(str2);
                if (method != null && method.getReturnType().equals(List.class)) {
                    rgm.a(stringBuilder, i, rgm.a(valueOf), reu.a(method, (Object) rgh, new Object[0]));
                }
            }
            str4 = "Map";
            if (replaceFirst.endsWith(str4) && !replaceFirst.equals(str4)) {
                str4 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                if (valueOf.length() == 0) {
                    valueOf = new String(str4);
                } else {
                    valueOf = str4.concat(valueOf);
                }
                method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    rgm.a(stringBuilder, i, rgm.a(valueOf), reu.a(method2, (Object) rgh, new Object[0]));
                }
            }
            String str22 = "set";
            if (((Method) hashMap2.get(replaceFirst.length() == 0 ? new String(str22) : str22.concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    str22 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(str22.length() == 0 ? new String(str) : str.concat(str22))) {
                    }
                }
                str22 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                str4 = String.valueOf(replaceFirst.substring(1));
                str4 = str4.length() == 0 ? new String(str22) : str22.concat(str4);
                method2 = (Method) hashMap.get(replaceFirst.length() == 0 ? new String(str) : str.concat(replaceFirst));
                valueOf = "has";
                Method method3 = (Method) hashMap.get(replaceFirst.length() == 0 ? new String(valueOf) : valueOf.concat(replaceFirst));
                if (method2 != null) {
                    rgh a = reu.a(method2, (Object) rgh, new Object[0]);
                    if (method3 == null) {
                        if (a instanceof Boolean) {
                            if (!((Boolean) a).booleanValue()) {
                            }
                        } else if (a instanceof Integer) {
                            if (((Integer) a).intValue() == 0) {
                            }
                        } else if (a instanceof Float) {
                            if (((Float) a).floatValue() == 0.0f) {
                            }
                        } else if (!(a instanceof Double)) {
                            boolean equals;
                            if (a instanceof String) {
                                equals = a.equals(str3);
                            } else if (a instanceof rdg) {
                                equals = a.equals(rdg.a);
                            } else if (a instanceof rgh) {
                                if (a == a.g()) {
                                }
                            } else if ((a instanceof Enum) && ((Enum) a).ordinal() == 0) {
                            }
                            if (equals) {
                            }
                        } else if (((Double) a).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) reu.a(method3, (Object) rgh, new Object[0])).booleanValue()) {
                    }
                    rgm.a(stringBuilder, i, rgm.a(str4), a);
                }
            }
        }
        if (rgh instanceof rev) {
            Iterator c = ((rev) rgh).zzuhx.c();
            while (c.hasNext()) {
                Entry entry = (Entry) c.next();
                int i4 = ((rey) entry.getKey()).b;
                StringBuilder stringBuilder2 = new StringBuilder(13);
                stringBuilder2.append("[");
                stringBuilder2.append(i4);
                stringBuilder2.append("]");
                rgm.a(stringBuilder, i, stringBuilder2.toString(), entry.getValue());
            }
        }
        rhs rhs = ((reu) rgh).zzuhr;
        if (rhs != null) {
            while (i2 < rhs.b) {
                rgm.a(stringBuilder, i, String.valueOf(rhs.c[i2] >>> 3), rhs.d[i2]);
                i2++;
            }
        }
    }

    private static final void a(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                rgm.a(stringBuilder, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Entry a2 : ((Map) obj).entrySet()) {
                rgm.a(stringBuilder, i, str, a2);
            }
        } else {
            stringBuilder.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str);
            String str2 = ": \"";
            if (obj instanceof String) {
                stringBuilder.append(str2);
                stringBuilder.append(rhl.a(rdg.a((String) obj)));
                stringBuilder.append('\"');
            } else if (obj instanceof rdg) {
                stringBuilder.append(str2);
                stringBuilder.append(rhl.a((rdg) obj));
                stringBuilder.append('\"');
            } else {
                String str3 = "}";
                str2 = "\n";
                String str4 = " {";
                if (obj instanceof reu) {
                    stringBuilder.append(str4);
                    rgm.a((reu) obj, stringBuilder, i + 2);
                    stringBuilder.append(str2);
                    while (i2 < i) {
                        stringBuilder.append(' ');
                        i2++;
                    }
                    stringBuilder.append(str3);
                } else if (obj instanceof Entry) {
                    stringBuilder.append(str4);
                    Entry entry = (Entry) obj;
                    int i4 = i + 2;
                    rgm.a(stringBuilder, i4, "key", entry.getKey());
                    rgm.a(stringBuilder, i4, "value", entry.getValue());
                    stringBuilder.append(str2);
                    while (i2 < i) {
                        stringBuilder.append(' ');
                        i2++;
                    }
                    stringBuilder.append(str3);
                } else {
                    stringBuilder.append(": ");
                    stringBuilder.append(obj.toString());
                }
            }
        }
    }

    private static final String a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }
}

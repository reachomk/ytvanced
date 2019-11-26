package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: anzi */
final class anzi {
    public static void a(anze anze, StringBuilder stringBuilder, int i) {
        String str;
        Method method;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = anze.getClass().getDeclaredMethods();
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
                    anzi.a(stringBuilder, i, anzi.a(valueOf), anxl.invokeOrDie(method, anze, new Object[0]));
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
                    anzi.a(stringBuilder, i, anzi.a(valueOf), anxl.invokeOrDie(method2, anze, new Object[0]));
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
                    anze invokeOrDie = anxl.invokeOrDie(method2, anze, new Object[0]);
                    if (method3 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            length = ((Boolean) invokeOrDie).booleanValue() ^ 1;
                        } else if (invokeOrDie instanceof Integer) {
                            if (((Integer) invokeOrDie).intValue() == 0) {
                            }
                        } else if (invokeOrDie instanceof Float) {
                            if (((Float) invokeOrDie).floatValue() == 0.0f) {
                            }
                        } else if (invokeOrDie instanceof Double) {
                            if (((Double) invokeOrDie).doubleValue() == 0.0d) {
                            }
                        } else if (invokeOrDie instanceof String) {
                            length = invokeOrDie.equals(str3);
                        } else if (invokeOrDie instanceof anvu) {
                            length = invokeOrDie.equals(anvu.a);
                        } else if (invokeOrDie instanceof anze) {
                            if (invokeOrDie == invokeOrDie.getDefaultInstanceForType()) {
                            }
                        } else if ((invokeOrDie instanceof Enum) && ((Enum) invokeOrDie).ordinal() == 0) {
                        }
                        if (length != 0) {
                        }
                    } else if (!((Boolean) anxl.invokeOrDie(method3, anze, new Object[0])).booleanValue()) {
                    }
                    anzi.a(stringBuilder, i, anzi.a(str4), invokeOrDie);
                }
            }
        }
        if (anze instanceof anxp) {
            Iterator d = ((anxp) anze).h.d();
            while (d.hasNext()) {
                Entry entry = (Entry) d.next();
                int i4 = ((anxs) entry.getKey()).b;
                StringBuilder stringBuilder2 = new StringBuilder(13);
                stringBuilder2.append("[");
                stringBuilder2.append(i4);
                stringBuilder2.append("]");
                anzi.a(stringBuilder, i, stringBuilder2.toString(), entry.getValue());
            }
        }
        aoau aoau = ((anxl) anze).unknownFields;
        if (aoau != null) {
            while (i2 < aoau.b) {
                anzi.a(stringBuilder, i, String.valueOf(aobj.b(aoau.c[i2])), aoau.d[i2]);
                i2++;
            }
        }
    }

    private static final void a(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                anzi.a(stringBuilder, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Entry a2 : ((Map) obj).entrySet()) {
                anzi.a(stringBuilder, i, str, a2);
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
                stringBuilder.append(aoal.a(anvu.a((String) obj)));
                stringBuilder.append('\"');
            } else if (obj instanceof anvu) {
                stringBuilder.append(str2);
                stringBuilder.append(aoal.a((anvu) obj));
                stringBuilder.append('\"');
            } else {
                String str3 = "}";
                str2 = "\n";
                String str4 = " {";
                if (obj instanceof anxl) {
                    stringBuilder.append(str4);
                    anzi.a((anxl) obj, stringBuilder, i + 2);
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
                    anzi.a(stringBuilder, i4, "key", entry.getKey());
                    anzi.a(stringBuilder, i4, "value", entry.getValue());
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

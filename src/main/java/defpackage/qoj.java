package defpackage;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qoj */
public final class qoj {
    private static final pon a = new pon("MetadataUtils");
    private static final String[] b = new String[]{"Z", "+hh", "+hhmm", "+hh:mm"};
    private static final String c;

    public static void a(List list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new pyb(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public static void a(JSONObject jSONObject, List list) {
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (pyb pyb : list) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("url", pyb.a.toString());
                    jSONObject2.put("width", pyb.b);
                    jSONObject2.put("height", pyb.c);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject2);
            }
            try {
                jSONObject.put("images", jSONArray);
            } catch (JSONException unused2) {
            }
        }
    }

    public static String a(Calendar calendar) {
        if (calendar != null) {
            String str = c;
            if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
                str = "yyyyMMdd";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            simpleDateFormat.setTimeZone(calendar.getTimeZone());
            String format = simpleDateFormat.format(calendar.getTime());
            str = "+0000";
            if (format.endsWith(str)) {
                format = format.replace(str, b[0]);
            }
            return format;
        }
        a.a("Calendar object cannot be null", new Object[0]);
        return null;
    }

    public static Calendar a(String str) {
        if (TextUtils.isEmpty(str)) {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        String b = qoj.b(str);
        if (TextUtils.isEmpty(b)) {
            a.a("Invalid date format", new Object[0]);
            return null;
        }
        str = qoj.c(str);
        if (TextUtils.isEmpty(str)) {
            str = "yyyyMMdd";
        } else {
            b = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder((b.length() + 1) + String.valueOf(str).length());
            stringBuilder.append(b);
            stringBuilder.append("T");
            stringBuilder.append(str);
            b = stringBuilder.toString();
            str = str.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str).parse(b));
            return instance;
        } catch (ParseException e) {
            a.a("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e) {
            a.e("Error extracting the date: %s", e.getMessage());
            return null;
        }
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            a.a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            a.a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            str = str.substring(i);
            if (str.length() != 6) {
                char charAt = str.charAt(6);
                if (charAt == '+' || charAt == '-') {
                    int length = str.length();
                    if (length == b[1].length() + 6 || length == b[2].length() + 6 || length == b[3].length() + 6) {
                        str = str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    }
                } else if (charAt != 'Z' || str.length() != b[0].length() + 6) {
                    return null;
                } else {
                    str = String.valueOf(str.substring(0, str.length() - 1));
                    String str2 = "+0000";
                    return str2.length() == 0 ? new String(str) : str.concat(str2);
                }
                return null;
            }
            return str;
        } catch (IndexOutOfBoundsException e) {
            a.a("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    static {
        String valueOf = String.valueOf(b[0]);
        String str = "yyyyMMdd'T'HHmmss";
        c = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}

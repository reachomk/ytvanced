package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aftn */
public final class aftn {
    public final List a;
    public final int b;

    private aftn(List list, Map map, int i) {
        this.a = Collections.unmodifiableList((List) amqw.a((Object) list, (Object) "videoIds can not be null"));
        amqw.a(this.a.isEmpty() ^ 1, (Object) "videoIds cannot be empty");
        Collections.unmodifiableMap((Map) amqw.a((Object) map, (Object) "params can not be null"));
        this.b = i;
    }

    private aftn(String str, Map map, int i) {
        this(Collections.singletonList(str), map, i);
    }

    public static aftn a(Uri uri) {
        if (xvt.e(uri)) {
            uri = uri.buildUpon().scheme("http").build();
        }
        String schemeSpecificPart;
        String valueOf;
        StringBuilder stringBuilder;
        if ("vnd.youtube".equals(uri.getScheme())) {
            schemeSpecificPart = uri.getSchemeSpecificPart();
            if (schemeSpecificPart.startsWith("//")) {
                schemeSpecificPart = schemeSpecificPart.substring(2);
            }
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                valueOf = String.valueOf(uri);
                stringBuilder = new StringBuilder(valueOf.length() + 24);
                stringBuilder.append("No video id in the Uri: ");
                stringBuilder.append(valueOf);
                throw new ParseException(stringBuilder.toString(), 0);
            }
            int indexOf = schemeSpecificPart.indexOf(63);
            if (indexOf > 0) {
                schemeSpecificPart = schemeSpecificPart.substring(0, indexOf);
            }
            Map b = aftn.b(uri);
            return new aftn(schemeSpecificPart, b, aftn.a((String) b.get("t")));
        }
        if ("youtu.be".equalsIgnoreCase(uri.getHost())) {
            List pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty() || TextUtils.isEmpty((CharSequence) pathSegments.get(0))) {
                valueOf = String.valueOf(uri);
                stringBuilder = new StringBuilder(valueOf.length() + 29);
                stringBuilder.append("No video id in the Uri path: ");
                stringBuilder.append(valueOf);
                throw new ParseException(stringBuilder.toString(), 0);
            }
            Map b2 = aftn.b(uri);
            return new aftn(pathSegments.subList(0, 1), aftn.a(b2), aftn.a(uri, b2));
        }
        schemeSpecificPart = uri.getPath();
        String fragment = uri.getFragment();
        String str = "/watch";
        if (schemeSpecificPart.startsWith(str) || schemeSpecificPart.startsWith("/movie")) {
            return aftn.c(uri);
        }
        if (schemeSpecificPart.startsWith("/get_video")) {
            Map b3 = aftn.b(uri);
            String str2 = (String) b3.get("video_id");
            if (!TextUtils.isEmpty(str2)) {
                return new aftn(str2, aftn.a(b3), aftn.a(uri, b3));
            }
            valueOf = String.valueOf(uri);
            stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("No id found in the uri: ");
            stringBuilder.append(valueOf);
            throw new ParseException(stringBuilder.toString(), 0);
        }
        String str3 = "start";
        if (schemeSpecificPart.startsWith("/v/")) {
            String[] split = uri.getLastPathSegment().split("&");
            schemeSpecificPart = split[0];
            Map hashMap = new HashMap();
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].split("=");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
            return new aftn(schemeSpecificPart, hashMap, aftn.a((String) hashMap.get(str3)));
        } else if (schemeSpecificPart.startsWith("/e/") || schemeSpecificPart.startsWith("/embed/")) {
            return new aftn(uri.getLastPathSegment(), aftn.b(uri), aftn.a(uri.getQueryParameter(str3)));
        } else {
            if (fragment == null || !(fragment.startsWith(str) || fragment.startsWith("watch"))) {
                throw new ParseException("Unrecognised URI", 0);
            }
            return aftn.c(Uri.parse(uri.buildUpon().encodedPath(uri.getFragment()).fragment("").build().toString()));
        }
    }

    private static Map b(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private static Map a(Map map) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("v");
        hashMap.remove("video_id");
        hashMap.remove("video_ids");
        hashMap.remove("feature");
        return hashMap;
    }

    private static int a(Uri uri, Map map) {
        String str = "t";
        String str2 = (String) map.get(str);
        if (str2 == null) {
            String decode = Uri.decode(uri.getEncodedFragment());
            if (!TextUtils.isEmpty(decode)) {
                String str3 = str2;
                for (String split : decode.split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2 && str.equals(split2[0])) {
                        str3 = split2[1];
                    }
                }
                str2 = str3;
            }
        }
        return aftn.a(str2);
    }

    private static aftn c(Uri uri) {
        Map b = aftn.b(uri);
        String str = (String) b.get("v");
        String str2 = (String) b.get("video_ids");
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            List pathSegments = uri.getPathSegments();
            int indexOf = pathSegments.indexOf("watch");
            String valueOf;
            StringBuilder stringBuilder;
            if (indexOf >= 0) {
                indexOf++;
                if (indexOf < pathSegments.size()) {
                    str = (String) pathSegments.get(indexOf);
                    if (TextUtils.isEmpty(str)) {
                        valueOf = String.valueOf(uri);
                        stringBuilder = new StringBuilder(valueOf.length() + 24);
                        stringBuilder.append("No video id in the Uri: ");
                        stringBuilder.append(valueOf);
                        throw new ParseException(stringBuilder.toString(), 0);
                    }
                }
                valueOf = String.valueOf(uri);
                stringBuilder = new StringBuilder(valueOf.length() + 24);
                stringBuilder.append("No id found in the Uri: ");
                stringBuilder.append(valueOf);
                throw new ParseException(stringBuilder.toString(), 0);
            }
            valueOf = String.valueOf(uri);
            stringBuilder = new StringBuilder(valueOf.length() + 28);
            stringBuilder.append("No /watch/ part in the Uri: ");
            stringBuilder.append(valueOf);
            throw new ParseException(stringBuilder.toString(), 0);
        }
        if (str2 == null) {
            return new aftn(str, aftn.a(b), aftn.a(uri, b));
        }
        return new aftn(Arrays.asList(str2.split(",")), aftn.a(b), aftn.a(uri, b));
    }

    private static int a(String str) {
        if (str == null) {
            return 0;
        }
        int a;
        int indexOf = str.indexOf("h");
        if (indexOf >= 0) {
            a = xvd.a(str.substring(0, indexOf), 0) * 3600000;
            str = str.substring(indexOf + 1);
        } else {
            a = 0;
        }
        indexOf = str.indexOf("m");
        if (indexOf >= 0) {
            a += xvd.a(str.substring(0, indexOf), 0) * 60000;
            str = str.substring(indexOf + 1);
        }
        if (str.endsWith("s")) {
            str = str.substring(0, str.length() - 1);
        }
        return a + ((int) (xvd.a(str, 0.0f) * 1000.0f));
    }
}

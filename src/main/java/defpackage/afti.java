package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: afti */
public final class afti {
    public static final Pattern b = Pattern.compile("(?:\\[|%5B)([a-zA-Z_:]+)(?:\\]|%5D)");
    public Map a;
    private Map c;

    public afti() {
        this.a = new HashMap();
        this.c = new HashMap();
    }

    public afti(aftl aftl) {
        this();
        a(aftl);
    }

    public final void a(aftl aftl) {
        amqw.a((Object) aftl);
        this.a.put(aftl.a(), aftl);
    }

    public final void a(Map map) {
        this.c.putAll(map);
    }

    public final Uri a(Uri uri, aftl... aftlArr) {
        amqw.a((Object) uri);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = b.matcher(uri.toString());
        while (matcher.find()) {
            if (matcher.groupCount() == 1) {
                String a = a(uri, matcher.group(1), aftlArr);
                if (a != null) {
                    matcher.appendReplacement(stringBuffer, Uri.encode(a));
                }
            }
        }
        matcher.appendTail(stringBuffer);
        try {
            return xvt.a(stringBuffer.toString());
        } catch (MalformedURLException e) {
            throw new xwd("Failed to convert URI", e);
        }
    }

    public final String a(Uri uri, String str, aftl... aftlArr) {
        String str2 = null;
        if (aftlArr != null) {
            for (aftl aftl : aftlArr) {
                if (aftl != null) {
                    str2 = aftl.a(uri, str);
                    if (str2 != null) {
                        return str2;
                    }
                }
            }
        }
        for (aftl a : this.a.values()) {
            str2 = a.a(uri, str);
            if (str2 != null) {
                break;
            }
        }
        return str2 == null ? (String) this.c.get(str) : str2;
    }

    public static Map b(Map map) {
        amqw.a((Object) map);
        HashMap hashMap = new HashMap(map.size());
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            for (String compile : (List) entry.getValue()) {
                arrayList.add(Pattern.compile(compile, 0));
            }
            if (arrayList.size() > 0) {
                hashMap.put(str, arrayList);
            }
        }
        return hashMap;
    }

    public static boolean a(Map map, String str, Uri uri) {
        if (map == null || !map.containsKey(str)) {
            return true;
        }
        for (Pattern matcher : (List) map.get(str)) {
            if (matcher.matcher(uri.toString()).find()) {
                return true;
            }
        }
        return false;
    }

    public static Set a(List list, Map map) {
        if (list.size() == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (Uri uri : list) {
            if (uri != null) {
                Matcher matcher = b.matcher(uri.toString());
                while (matcher.find()) {
                    if (matcher.groupCount() == 1) {
                        String group = matcher.group(1);
                        if (group != null && afti.a(map, group, uri)) {
                            hashSet.add(group);
                        }
                    }
                }
            }
        }
        return hashSet;
    }
}

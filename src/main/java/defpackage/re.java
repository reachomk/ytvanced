package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: re */
final class re implements rf {
    public final HashMap a = new HashMap();
    private final String b;

    re(String str) {
        this.b = str;
    }

    public final Uri a(File file) {
        Object file2;
        StringBuilder stringBuilder;
        try {
            file2 = file2.getCanonicalPath();
            Entry entry = null;
            for (Entry entry2 : this.a.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (file2.startsWith(path)) {
                    if (entry == null || path.length() > ((File) entry.getValue()).getPath().length()) {
                        entry = entry2;
                    }
                }
            }
            if (entry != null) {
                String substring;
                String path2 = ((File) entry.getValue()).getPath();
                String str = "/";
                if (path2.endsWith(str)) {
                    substring = file2.substring(path2.length());
                } else {
                    substring = file2.substring(path2.length() + 1);
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(Uri.encode((String) entry.getKey()));
                stringBuilder2.append('/');
                stringBuilder2.append(Uri.encode(substring, str));
                return new Builder().scheme("content").authority(this.b).encodedPath(stringBuilder2.toString()).build();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find configured root that contains ");
            stringBuilder.append(file2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } catch (IOException unused) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to resolve canonical path for ");
            stringBuilder.append(file2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final File a(Uri uri) {
        StringBuilder stringBuilder;
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        encodedPath = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.a.get(decode);
        if (file != null) {
            Object file2 = new File(file, encodedPath);
            try {
                file2 = file2.getCanonicalFile();
                if (file2.getPath().startsWith(file.getPath())) {
                    return file2;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to resolve canonical path for ");
                stringBuilder.append(file2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find configured root for ");
        stringBuilder.append(uri);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

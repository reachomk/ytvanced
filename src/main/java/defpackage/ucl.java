package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ucl */
public final class ucl {
    private final File a;
    private final List b;
    private final int c;
    private final List d;

    public final long a(uco uco) {
        Throwable e;
        uco uco2 = uco;
        bcej bcej = (bcej) bcek.e.createBuilder();
        bcej.a(uco2.a);
        long a;
        try {
            File[] listFiles = new File(uco2.c.a, uco2.a).listFiles();
            if (uco2.b >= this.c || this.d.size() >= 512) {
                a = ucm.a(listFiles);
                bcej.a(a);
                this.d.add((bcek) ((anxl) bcej.build()));
                return a;
            }
            int length = listFiles.length;
            a = 0;
            int i = 0;
            while (i < length) {
                try {
                    File file = listFiles[i];
                    if (!ucm.a(file)) {
                        long length2;
                        if (file.isFile()) {
                            String name = file.getName();
                            if (uco2.b != 0) {
                                String str = uco2.a;
                                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(name).length());
                                stringBuilder.append(str);
                                stringBuilder.append('/');
                                stringBuilder.append(name);
                                name = stringBuilder.toString();
                            }
                            for (Pattern matcher : this.b) {
                                if (matcher.matcher(name).matches()) {
                                    if (this.d.size() < 512) {
                                        bcej bcej2 = (bcej) bcek.e.createBuilder();
                                        bcej2.a(name);
                                        bcej2.a(file.length());
                                        this.d.add((bcek) ((anxl) bcej2.build()));
                                    }
                                    length2 = file.length();
                                }
                            }
                            length2 = file.length();
                        } else if (file.isDirectory()) {
                            length2 = a(new uco(this, uco2, file.getName()));
                        }
                        a += length2;
                    }
                    i++;
                } catch (IOException | SecurityException e2) {
                    e = e2;
                    tyv.a("DirStatsCapture", "exception while collecting DirStats for dir %s", e, uco2.a);
                    bcej.a(a);
                    this.d.add((bcek) ((anxl) bcej.build()));
                    return a;
                }
            }
            bcej.a(a);
            this.d.add((bcek) ((anxl) bcej.build()));
            return a;
        } catch (IOException | SecurityException e3) {
            e = e3;
            a = 0;
        }
    }

    public /* synthetic */ ucl(File file, List list, int i, Pattern[] patternArr) {
        List emptyList;
        this.a = file;
        this.c = i;
        this.d = list;
        if (patternArr.length == 0) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Arrays.asList(patternArr);
        }
        this.b = emptyList;
    }
}

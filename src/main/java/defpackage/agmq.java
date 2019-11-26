package defpackage;

import java.io.File;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: agmq */
public final class agmq implements oww {
    public final void a(File file, long j) {
    }

    public final void a(String str, oxq oxq) {
    }

    public final void a(oxf oxf) {
    }

    public final void b() {
    }

    public final void b(oxf oxf) {
    }

    public final boolean b(String str, long j, long j2) {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final NavigableSet a(String str) {
        return new TreeSet();
    }

    public final Set c() {
        return new HashSet();
    }

    public final oxf b(String str, long j) {
        return new oxf(str, j, -1, 0, null);
    }

    public final oxf a(String str, long j) {
        return b(str, j);
    }

    public final File a(String str, long j, long j2) {
        throw new owv("starting a new file is not supported by NoOpCache");
    }

    public final oxo b(String str) {
        return oxp.a;
    }
}

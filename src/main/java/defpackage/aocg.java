package defpackage;

import java.io.IOException;

/* renamed from: aocg */
public final class aocg extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public aocg(String str) {
        super(str);
    }

    public aocg(String str, Exception exception) {
        super(str, exception);
    }

    static aocg a() {
        return new aocg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static aocg b() {
        return new aocg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static aocg c() {
        return new aocg("CodedInputStream encountered a malformed varint.");
    }

    static aocg d() {
        return new aocg("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}

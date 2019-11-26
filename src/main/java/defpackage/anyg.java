package defpackage;

import java.io.IOException;

/* renamed from: anyg */
public class anyg extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public anyg(String str) {
        super(str);
    }

    static anyg a() {
        return new anyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static anyg b() {
        return new anyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static anyg c() {
        return new anyg("CodedInputStream encountered a malformed varint.");
    }

    static anyg d() {
        return new anyg("Protocol message contained an invalid tag (zero).");
    }

    static anyg e() {
        return new anyg("Protocol message end-group tag did not match expected tag.");
    }

    static anyf f() {
        return new anyf("Protocol message tag had invalid wire type.");
    }

    static anyg g() {
        return new anyg("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static anyg h() {
        return new anyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static anyg i() {
        return new anyg("Failed to parse the message.");
    }

    static anyg j() {
        return new anyg("Protocol message had invalid UTF-8.");
    }
}

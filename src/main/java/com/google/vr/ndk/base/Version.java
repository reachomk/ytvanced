package com.google.vr.ndk.base;

import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Version {
    public static final Version CURRENT = parse("1.212.0");
    public static final Version MIN = parse("1.81.0");
    public final int majorVersion;
    public final int minorVersion;
    public final int patchVersion;

    public Version(int i, int i2, int i3) {
        this.majorVersion = i;
        this.minorVersion = i2;
        this.patchVersion = i3;
    }

    public static Version parse(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(str);
        if (matcher.matches()) {
            return new Version(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
        }
        String str2 = "Failed to parse version from: ";
        Log.w("Version", str.length() == 0 ? new String(str2) : str2.concat(str));
        return null;
    }

    public final boolean isAtLeast(Version version) {
        int i = this.majorVersion;
        int i2 = version.majorVersion;
        if (i > i2) {
            return true;
        }
        if (i < i2) {
            return false;
        }
        i = this.minorVersion;
        i2 = version.minorVersion;
        if (i > i2) {
            return true;
        }
        if (i < i2) {
            return false;
        }
        i = this.patchVersion;
        int i3 = version.patchVersion;
        return i > i3 || i >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Version) {
            Version version = (Version) obj;
            if (this.majorVersion == version.majorVersion && this.minorVersion == version.minorVersion && this.patchVersion == version.patchVersion) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.majorVersion), Integer.valueOf(this.minorVersion), Integer.valueOf(this.patchVersion)});
    }

    public final String toString() {
        return String.format("%d.%d.%d", new Object[]{Integer.valueOf(this.majorVersion), Integer.valueOf(this.minorVersion), Integer.valueOf(this.patchVersion)});
    }
}

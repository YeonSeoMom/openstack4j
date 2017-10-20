package org.openstack4j.openstack.image.v2.domain;


import org.openstack4j.openstack.common.Metadata;


public class GlanceLocation {

    private String url;
    private Metadata metadata;

    @Override
    public String toString() {
        return "GlanceLocation{" +
                "url='" + url + '\'' +
                ", metadata=" + metadata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GlanceLocation)) return false;

        GlanceLocation that = (GlanceLocation) o;

        return getUrl() != null ? getUrl().equals(that.getUrl()) : that.getUrl() == null;
    }

    @Override
    public int hashCode() {
        return getUrl() != null ? getUrl().hashCode() : 0;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}

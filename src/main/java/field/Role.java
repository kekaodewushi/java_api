package field;

/**
 * Created by zangyaoyi on 2017/7/18.
 */


import java.util.List;
public class Role extends User {
    public String roleName;
    public String userId;
    public List<User> children;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<User> getChildren() {
        return children;
    }

    public void setChildren(List<User> children) {
        this.children = children;
    }
}
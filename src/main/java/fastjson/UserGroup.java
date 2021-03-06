package fastjson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zangyaoyi on 2017/1/13.
 */
public class UserGroup {

        private String name;
        private List<User> users = new ArrayList<User>();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<User> getUsers() {
            return users;
        }

        public void setUsers(List<User> users) {
            this.users = users;
        }

        @Override
        public String toString() {
            return "UserGroup [name=" + name + ", users=" + users + "]";
        }

}

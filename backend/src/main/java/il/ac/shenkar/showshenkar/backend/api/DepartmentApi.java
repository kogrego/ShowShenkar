package il.ac.shenkar.showshenkar.backend.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

import java.util.List;

import il.ac.shenkar.showshenkar.backend.OfyService;
import il.ac.shenkar.showshenkar.backend.model.Department;
import il.ac.shenkar.showshenkar.backend.model.Project;

/**
 * Created by:  Gregory Kondratenko on 10/06/2016.
 * Description: Backend api for app projects
 */
@Api(
        name = "departmentApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.showshenkar.shenkar.ac.il",
                ownerName = "backend.showshenkar.shenkar.ac.il",
                packagePath=""
        )
)
public class DepartmentApi {

    @ApiMethod(
            name = "getDepartment",
            path = "departmentApi/{name}",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public Department getDepartment(@Named("name") String name){
        return OfyService.ofy().load().type(Department.class).filter("name", name).first().now();
    }

    @ApiMethod(
            name = "getDepartments",
            path = "departmentApi",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public List<Department> getDepartments(){
        return OfyService.ofy().load().type(Department.class).list();
    }

    @ApiMethod(
            name = "setDepartment",
            path = "departmentApi",
            httpMethod = ApiMethod.HttpMethod.POST
    )
    public Department setDepartment(Department department){
        if (department == null){
            throw new IllegalStateException("Department is null");
        }

        if (department.getName() != null) {
            throw new IllegalStateException("Department already exits");
        }

        OfyService.ofy().save().entity(department).now();
        return department;
    }

}
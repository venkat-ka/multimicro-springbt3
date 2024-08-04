import  {useContext, useEffect} from 'react'
import  useGetUserList from '../service/AuthService.ts'
import AuthContext from '../ContextData/AuthContext.ts';
const UserDetailComponent = () => {
   const {isLoggedIn, token} = useContext(AuthContext)
  const {getUserList} = useGetUserList();
   
    useEffect(()=>{
        console.log(isLoggedIn?.token)
        if(isLoggedIn?.token)
            {
               
               getUserList('/users-ws/users/getAll').
              then((res)=>{console.log(res)}).catch(err=>{
             console.log(err)
             
         })
         
        }
        //console.log(dc)
       
     }, [isLoggedIn])


    const renderTitle = () => {
        return <h4>User Manament</h4>
    }

    const useerlist = () => {
        return <h4>list updated from nginx of User </h4>
    }
    const addUser = () => {
        return <button>Add Button </button>
    }



    return <>
    {isLoggedIn + " ==> login checking"}
    {renderTitle()}
    {addUser()}
    {useerlist()}</>
    
}
export default UserDetailComponent;